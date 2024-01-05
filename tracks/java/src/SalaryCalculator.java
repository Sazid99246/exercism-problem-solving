/**
 * The SalaryCalculator class calculates the final salary of an employee based
 * on the number of days skipped and products sold.
 * It takes into account salary deductions for days skipped and bonuses for
 * products sold.
 */
public class SalaryCalculator {

    /**
     * Calculates the salary multiplier based on the number of days skipped.
     * A deduction is applied if the employee skips 5 or more days.
     *
     * @param daysSkipped The number of days the employee skipped.
     * @return The salary multiplier.
     */
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    /**
     * Calculates the bonus multiplier based on the number of products sold.
     * A higher multiplier is applied if the employee sells 20 or more products.
     *
     * @param productsSold The number of products sold by the employee.
     * @return The bonus multiplier.
     */
    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    /**
     * Calculates the total bonus for the products sold.
     *
     * @param productsSold The number of products sold by the employee.
     * @return The total bonus amount.
     */
    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    /**
     * Calculates the final salary of the employee.
     * The final salary is a sum of the base salary (after applying the salary
     * multiplier) and the bonus for products sold.
     * However, the final salary is capped at $2000.
     *
     * @param daysSkipped  The number of days the employee skipped.
     * @param productsSold The number of products sold by the employee.
     * @return The final salary, capped at $2000.
     */
    public double finalSalary(int daysSkipped, int productsSold) {
        double totalSalary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return totalSalary <= 2000 ? totalSalary : 2000;
    }
}
