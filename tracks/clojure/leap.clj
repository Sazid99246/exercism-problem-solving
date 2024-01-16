(ns leap)

(defn leap-year? [year]
  (and (== (mod year 4) 0)
       (or (not= (mod year 100) 0)
           (== (mod year 400) 0))))
