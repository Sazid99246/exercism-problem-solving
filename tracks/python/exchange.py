"""
Currency Exchange Module

This module provides various functions to assist with currency exchange calculations. 
It allows users to calculate the exchanged value of a foreign currency, determine the 
leftover budget after an exchange, compute the value and number of currency bills, and 
calculate the maximum exchangeable value after considering exchange rates and additional 
spreads. Functions in this module help in understanding different aspects of currency 
exchange, making it easier to perform precise financial calculations related to 
foreign currency transactions.

Functions:
    exchange_money(budget, exchange_rate):
        Calculate the exchanged value of a foreign currency based on the given budget 
        and exchange rate.

    get_change(budget, exchanging_value):
        Determine the remaining amount of the original currency after a specified 
        amount has been exchanged.

    get_value_of_bills(denomination, number_of_bills):
        Calculate the total value of a set of bills given their denomination and quantity.

    get_number_of_bills(amount, denomination):
        Determine the maximum number of bills of a particular denomination that can 
        be obtained from a given amount.

    get_leftover_of_bills(amount, denomination):
        Calculate the leftover amount after dividing the total amount by the bill denomination.

    exchangeable_value(budget, exchange_rate, spread, denomination):
        Compute the maximum value that can be exchanged into foreign currency considering 
        the exchange rate, a percentage spread as exchange fee, and rounding down to the 
        nearest bill denomination.

Example:
    To use the module, simply import it and call the desired function with the 
    appropriate parameters:
    
    >>> exchangeable_value(100, 1.5, 5, 10)
    63

This module is particularly useful for financial applications, travel planning, or 
any scenario where currency exchange calculations are required.
"""

def exchange_money(budget, exchange_rate):
    """
    :param budget: float - amount of money you are planning to exchange.
    :param exchange_rate: float - unit value of the foreign currency.
    :return: float - exchanged value of the foreign currency you can receive.
    """

    return budget / exchange_rate


def get_change(budget, exchanging_value):
    """

    :param budget: float - amount of money you own.
    :param exchanging_value: float - amount of your money you want to exchange now.
    :return: float - amount left of your starting currency after exchanging.
    """

    return budget - exchanging_value


def get_value_of_bills(denomination, number_of_bills):
    """

    :param denomination: int - the value of a bill.
    :param number_of_bills: int - total number of bills.
    :return: int - calculated value of the bills.
    """

    return denomination * number_of_bills


def get_number_of_bills(amount, denomination):
    """

    :param amount: float - the total starting value.
    :param denomination: int - the value of a single bill.
    :return: int - number of bills that can be obtained from the amount.
    """

    return int(amount / denomination)


def get_leftover_of_bills(amount, denomination):
    """

    :param amount: float - the total starting value.
    :param denomination: int - the value of a single bill.
    :return: float - the amount that is "leftover", given the current denomination.
    """

    return amount % denomination


def exchangeable_value(budget, exchange_rate, spread, denomination):
    """

    :param budget: float - the amount of your money you are planning to exchange.
    :param exchange_rate: float - the unit value of the foreign currency.
    :param spread: int - percentage that is taken as an exchange fee.
    :param denomination: int - the value of a single bill.
    :return: int - maximum value you can get.
    """

    new_rate = exchange_rate + (exchange_rate * (spread / 100))
    total_new_currency = exchange_money(budget, new_rate)

    bill_value_new_currency = int(total_new_currency / denomination)
    maximun_value_new_currency = bill_value_new_currency * denomination

    return maximun_value_new_currency
