const hey = (message) => {
    if (message.trim() === '') {
        return "Fine. Be that way!";
    } else if (message === message.toUpperCase() && /[A-Z]/.test(message)) {
        if (message.trim().endsWith("?")) {
            return "Calm down, I know what I'm doing!";
        }
        return "Whoa, chill out!";
    } else if (message.endsWith("?")) {
        return "Sure.";
    } else {
        return "Whatever.";
    }
};
console.log(hey("How are you?"));
console.log(hey("I AM HAPPY"));
console.log(hey("WHAT THE HELL WERE YOU THINKING?"));
console.log(hey("\t\t\t\t"));
console.log(hey("Tom-ay-to, tom-aaaah-to."));