class AssemblyLine
  NUMBER_OF_CARS = 221

  def initialize(speed)
    @speed = speed
  end

  def success_rate
    case @speed
    when 10
      return 0.77
    when 9
      return 0.8
    when 5..8
      return 0.9
    else
      return 1
    end
  end

  def production_rate_per_hour
    (NUMBER_OF_CARS * @speed) * success_rate
  end

  def working_items_per_minute
    (production_rate_per_hour / 60).to_i
  end
end
