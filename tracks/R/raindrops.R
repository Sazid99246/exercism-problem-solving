raindrops <- function(number) {
    result = ""
    if (number %% 3 == 0) {
       result = paste(result, "Pling", sep = "")
    }
    if(number %% 5 == 0){
        result <-paste(result,"Plang", sep = "")
    }
    if(number %% 7 == 0){
        result <- paste(result,"Plong", sep="")
    }
    if(result == ""){
        result <- as.character(number)
    }
    return(result)
}
