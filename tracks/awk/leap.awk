{ print $0 % 4 == 0 && $0 % 100 != 0 || $0 % 400 == 0 ? "true" : "false" }