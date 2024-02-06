"
roman-numerals
"
Class {
	#name : #RomanNumerals,
	#superclass : #Object,
	#instVars : [
		'symbol',
		'number'
	],
	#category : #'Exercise@RomanNumerals'
}
{ #category : #utilities }
RomanNumerals >> initialize [
	symbol := {#I . #IV . #V . #IX . #X . #XL . #L . #XC . #C . #CD . #D.
	#CM . #M}.
	number := {1 . 4 . 5 . 9 . 10 . 40 . 50 . 90 . 100 . 400 . 500 . 900.
	1000}
]
{ #category : #utilities }
RomanNumerals >> romanNumber: anInteger [
	^ String
		streamContents: [ :stream | 
			| compute index |
			compute := anInteger.
			index := 13.
			[ compute > 0 ]
				whileTrue: [ | quotient |
					quotient := compute // (number at: index).
					compute := compute \\ (number at: index).
					quotient timesRepeat: [ stream nextPutAll: (symbol at: index) ].
					index := index - 1 ] ]
]