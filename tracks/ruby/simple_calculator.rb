class SimpleCalculator
  ALLOWED_OPERATIONS = ["+", "/", "*"].freeze

  def self.calculate(first_operand, second_operand, operation)
    raise ArgumentError.new("Invalid Argument") if [first_operand, second_operand].any? { |o| o.is_a? String }
    raise SimpleCalculator::UnsupportedOperation if not ALLOWED_OPERATIONS.include?(operation)

    begin
      result = first_operand.send operation, second_operand
      %(#{first_operand} #{operation} #{second_operand} = #{result})
    rescue ZeroDivisionError
      "Division by zero is not allowed."
    end
  end
end

class SimpleCalculator::UnsupportedOperation < StandardError
end
