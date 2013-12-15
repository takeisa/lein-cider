# lein-cider

A [Leiningen](https://github.com/technomancy/leiningen) plugin for
starting [Cider](https://github.com/clojure-emacs/cider) on Emacs.

## Usage

#### Leiningen ([via Clojars](https://clojars.org/lein-cider))

Put the following into the `:plugins` vector of the `:user` profile in your `~/.lein/profiles.clj`:

```clojure
[lein-cider "0.1.0-SNAPSHOT"]
```

#### Command Line

You can use `lein-cider` to execute Cider on Emacs.

This plugin uses emacsclient command.
Execute [emacs as a server](https://www.gnu.org/software/emacs/manual/html_node/emacs/Emacs-Server.html) before below 'lein cider' command.

```
$ lein new hello
$ cd hello
$ lein cider
```

## License

Copyright © 2013 Satoshi Takei

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
