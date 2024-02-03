class ResistorColorDuo
  BANDS = {
    black: 0,
    brown: 1,
    red: 2,
    orange: 3,
    yellow: 4,
    green: 5,
    blue: 6,
    violet: 7,
    grey: 8,
    white: 9,
  }.freeze

  def self.value(colors)
    "#{BANDS[colors[0].to_sym]}#{BANDS[colors[1].to_sym]}".to_i
  end
end
