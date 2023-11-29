import java.util.ArrayList;
import java.util.Scanner;

class Expense
 {
    String description;
    double amount;
    String category;

    public Expense(String description, double amount, String category) 
    {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}

class ExpenseTracker 
 {
    private ArrayList<Expense> expenses;

    public ExpenseTracker() 
    {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(String description, double amount, String category)
    {
        Expense expense = new Expense(description, amount, category);
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    public void viewExpenses()
    {
        if (expenses.isEmpty()) 
        {
            System.out.println("No expenses recorded yet.");
            return;
        }

        System.out.println("List of Expenses:");
        for (Expense expense : expenses) {
            System.out.println("Description: " + expense.description);
            System.out.println("Amount: $" + expense.amount);
            System.out.println("Category: " + expense.category);
            System.out.println("---------------------------");
        }
    }

    public double calculateTotalExpenses() 
    {
        return expenses.stream().mapToDouble(expense -> expense.amount).sum();
    }

    public double calculateTotalExpensesByCategory(String category) 
    {
        return expenses.stream()
                .filter(expense -> expense.category.equalsIgnoreCase(category))
                .mapToDouble(expense -> expense.amount)
                .sum();
    }
}



public class Task3
  {
    public static void main(String[] args) 
    {
        ExpenseTracker expenseTracker = new ExpenseTracker();
        Scanner sc = new Scanner(System.in);

        while (true) 
         {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total Expenses");
            System.out.println("4. View Total Expenses by Category");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
              {
                case 1:
                    System.out.print("Enter expense description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter expense amount: $");
                    double amount = sc.nextDouble();

                    System.out.print("Enter expense category: ");
                    String category = sc.next();

                    expenseTracker.addExpense(description, amount, category);
                    break;

                case 2:
                    expenseTracker.viewExpenses();
                    break;

                case 3:
                    System.out.println("Total Expenses:" + expenseTracker.calculateTotalExpenses());
                    break;

                case 4:
                    System.out.print("Enter category to view total expenses: ");
                    String categoryToView = sc.next();
                    System.out.println("Total Expenses for " + categoryToView + ": $"
                            + expenseTracker.calculateTotalExpensesByCategory(categoryToView));
                    break;

                case 5:
                    System.out.println("Exiting Expense Tracker. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
               }
           }
       }
}
