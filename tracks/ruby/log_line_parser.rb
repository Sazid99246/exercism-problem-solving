class LogLineParser
    def initialize(line)
      @line = line
    end
  
    def message
      @line.split(":")[1].strip
    end
  
    def log_level
      @line.split(":")[0].gsub(/[\[\]]/, '').downcase
    end
  
    def reformat
      message + " (" + "" + log_level + ")"
    end
end
puts LogLineParser.new('[ERROR]: Invalid operation').message;
puts LogLineParser.new('[ERROR]: Invalid operation').log_level;
puts LogLineParser.new('[ERROR]: Invalid operation').reformat;