(ns lambdup-workshop.intro)

(def balls
  [{:size 1
    :color "yellow"}
   {:size 10
    :color "red"}
   {:size 5
    :color "blue"}
   {:size 10
    :color "yellow"}
   {:size 2
    :color "blue"}])

(defn blue? [{:keys [color]}]
  (= color "blue"))


