module Raindrops
    def self.convert(number)
        result = ""
        if number % 3 == 0
          result += "Pling"
        end
        if number % 5 == 0
          result += "Plang"
        end
        if number % 7 == 0
          result += "Plong"
        end

        if result.empty?
          result = number.to_s
        end

        result
    end
end

puts Raindrops.convert(28)
puts Raindrops.convert(30)
puts Raindrops.convert(34)