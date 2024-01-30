(defpackage :pal-picker
  (:use :cl)
  (:export :pal-picker :habitat-fitter :feeding-time-p
           :pet :play-fetch))

(in-package :pal-picker)

(defun pal-picker (personality)
  (case personality
    (:lazy "Cat")
    (:energetic "Dog")
    (:quiet "Fish")
    (:hungry "Rabbit")
    (:talkative "Bird")
    (otherwise "I don't know... A dragon?")))

(defun habitat-fitter (weight)
  (cond ((>= weight 40) :massive)
        ((and (>= weight 20) (< weight 40)) :large)
        ((and (>= weight 10) (< weight 20)) :medium)
        ((and (>= weight 1)  (< weight 10)) :small)
        ((< weight 1) :just-your-imagination)))

(defun feeding-time-p (fullness)
  (cond ((> fullness 20) "All is well.")
        ((<= fullness 20) "It's feeding time!")))

(defun pet (pet)
  (when (string= pet "Fish")
    "Maybe not with thes pet..."))

(defun play-fetch (pet)
  (unless (string= pet "Dog")
    "Maybe not with thes pet..."))
