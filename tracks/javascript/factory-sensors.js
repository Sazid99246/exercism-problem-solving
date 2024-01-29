export class ArgumentError extends Error {}

export class OverheatingError extends Error {
  constructor(temperature) {
    super(`The temperature is ${temperature} ! Overheating !`);
    this.temperature = temperature;
  }
}

/**
 * Check if the humidity level is not too high.
 *
 * @param {number} humidityPercentage
 * @throws {Error}
 */
export function checkHumidityLevel(humidityPercentage) {
    if (humidityPercentage > 70) {
        throw new Error('Implement the reportOverheating function');
    }
}

/**
 * Check if the temperature is not too high.
 *
 * @param {number|null} temperature
 * @throws {ArgumentError|OverheatingError}
 */
export function reportOverheating(temperature) {
  if (temperature == null) {
    throw new ArgumentError('Temparature should not be null.')
  } else if (temperature > 500) {
    throw new OverheatingError(temperature);
  }
}

/**
 *  Triggers the needed action depending on the result of the machine check.
 *
 * @param {{
 * check: function,
 * alertDeadSensor: function,
 * alertOverheating: function,
 * shutdown: function
 * }} actions
 * @throws {ArgumentError|OverheatingError|Error}
 */
export function monitorTheMachine(actions) {
  try {
    actions.check();
  } catch (error) {
    switch (error.constructor) {
      case ArgumentError:
        actions.alertDeadSensor();
        return;
      case OverheatingError: {
        if (error.temperature > 600) {
          actions.shutdown();
          return;
        }
        if (error.temperature > 500) {
          actions.alertOverheating();
          return;
        }
      }
      default:
        throw error;
    }
  }
}
