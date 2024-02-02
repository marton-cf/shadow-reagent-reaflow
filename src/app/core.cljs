(ns app.core
  (:require [reagent.core :as r]
            ["reaflow" :refer [Canvas]]
            ))

(def flow
  (r/adapt-react-class Canvas))

(defn ^:dev/after-load start
  []
  (r/render-component [flow]
                      (.getElementById js/document "app")))

(defn ^:export main
  []
  (start))
