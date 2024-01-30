class Attendee
    def initialize(height)
        @heard = height
    end
  
    def height
        @heard
    end
  
    def pass_id
        @pass_id
    end
  
    def issue_pass!(pass_id)
        @pass_id = pass_id
    end
  
    def revoke_pass!
        @pass_id = nil
    end
end
  