(ns clojure-web.views.welcome
  (:require [clojure-web.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to clojure-web"]))
