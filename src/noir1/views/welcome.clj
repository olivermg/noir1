(ns noir1.views.welcome
  (:require [noir1.views.common :as common]
            [noir.content.getting-started]
            [stencil.core :as stencil])

  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to noir1"]))

(defpage "/owpage" []
  (common/site-layout
   [:h1 "blah"]
   [:p "hope you like it!"]))

(defpage "/mustache" []
  (stencil/render-file "public/templates/page1"
                       {:name "Oliver"
                        :message "Oh noes"}))

(defpage "/fluid" []
  (stencil/render-file
   "public/templates/fluid"
   {:username "Oliver"}))
