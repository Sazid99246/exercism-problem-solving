// @ts-check

/**
 * Given a certain command, help the chatbot recognize whether the command is valid or not.
 *
 * @param {string} command
 * @returns {boolean} whether or not is the command valid
 */

export function isValidCommand(command) {
  return command.search(/chatbot/i) == 0 ? true:false; 
}

/**
 * Given a certain message, help the chatbot get rid of all the emoji's encryption through the message.
 *
 * @param {string} message
 * @returns {string} The message without the emojis encryption
 */
export function removeEmoji(message) {
  // @ts-ignore
  return message.replaceAll(/emoji\d{4}/g, '');
}

/**
 * Given a certain phone number, help the chatbot recognize whether it is in the correct format.
 *
 * @param {string} number
 * @returns {string} the Chatbot response to the phone Validation
 */
export function checkPhoneNumber(number) {
    return /\(\+\d{2}\)\s\d{3}\-\d{3}\-\d{3}/.test(number) ? 'Thanks! You can now download me to your phone.' : 'Oops, it seems like I can\'t reach out to ' + number;
}

/**
 * Given a certain response from the user, help the chatbot get only the URL.
 *
 * @param {string} userInput
 * @returns {string[] | null} all the possible URL's that the user may have answered
 */
export function getURL(userInput) {
  return userInput.match(/\w*\.\w*/g);
}

/**
 * Greet the user using the full name data from the profile.
 *
 * @param {string} fullName
 * @returns {string} Greeting from the chatbot
 */
export function niceToMeetYou(fullName) {
  var name = fullName.split(', ');
  return 'Nice to meet you, ' + name[1] + ' ' + name[0]; 
}