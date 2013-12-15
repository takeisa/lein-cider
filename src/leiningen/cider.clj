(ns leiningen.cider
  (:require [leiningen.core.main :as main])
  (:require [leiningen.repl]))

(def WAIT_TIME 3000)

(in-ns 'leiningen.repl)

(defn call-cider [host port]
  (let [cider-elisp (format "(cider \"%s\" \"%d\")" host port)]
;    (println (str "Emacs: " cider-elisp))
    (clojure.java.shell/sh "emacsclient" "--eval" cider-elisp)))

(def original-server-func server)

(defn server [project cfg headless?]
  (let [port (apply original-server-func [project cfg headless?])
        host (:host cfg)]
    (future
      (Thread/sleep leiningen.cider/WAIT_TIME)
      (call-cider host port))
    port))

(in-ns 'leiningen.cider)
(defn cider [project & args]
  (main/apply-task "repl" project nil))

