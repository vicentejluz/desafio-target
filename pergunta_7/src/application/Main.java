package application;

public class Main {
    public static void main(String[] args) {
        String state[] = new String[] {
                "SP",
                "RJ",
                "MG",
                "ES",
                "Outros"
        };
        double monthlyBillingState[] = new double[] {
                67836.43d,
                36678.66d,
                29229.88d,
                27165.48d,
                19849.53d
        };
        double totalBilling = 0;
        double percentage;

        for (int i = 0; i < state.length; i++) {
            totalBilling += monthlyBillingState[i];
        }

        System.out.println("Faturamento total: R$ " + totalBilling);
        System.out.println();

        for (int i = 0; i < state.length; i++) {
            percentage = (monthlyBillingState[i] / totalBilling) * 100;
            System.out.printf("Percentual de %s: %.2f%%\n", state[i], percentage);
        }
    }
}
