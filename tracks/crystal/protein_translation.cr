module ProteinTranslation
    def self.proteins(strand : String) : Array(String)
        strand
        .scan(/.{1,3}/)
        .take_while { |codon| !codon.in?(["UAA", "UAG", "UGA"]) }
        .map do |codon|
            case codon
            when "AUG"                      then "Methionine"
            when "UUU", "UUC"               then "Phenylalanine"
            when "UUA", "UUG"               then "Leucine"
            when "UCU", "UCC", "UCA", "UCG" then "Serine"
            when "UAU", "UAC"               then "Tyrosine"
            when "UGU", "UGC"               then "Cysteine"
            when "UGG"                      then "Tryptophan"
            else                            raise ArgumentError.new
            end
        end
    end
end