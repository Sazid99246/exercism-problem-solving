(defpackage :pizza-pi
  (:use :cl)
  (:export :dough-calculator :pizzas-per-cube
           :size-from-sauce :fair-share-p))

(in-package :pizza-pi)

(defun dough-calculator (pizzas diameter)
    (round (* (+ (/ (* 45 pi diameter) 20) 200) pizzas)))

(defun size-from-sauce (sauce)
    (sqrt (/ (* 40 sauce) (* 3 pi))))

(defun pizzas-per-cube (cube-size diameter)
    (floor (/ (* (expt cube-size 3) 2) (* (expt diameter 2) pi 3))))

(defun fair-share-p (pizzas friends)
    (= 0 (mod (* pizzas 8) friends)))
