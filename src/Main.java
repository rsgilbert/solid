import bad.MultipleResponsibilityText;
import bad.openclosed.ClaimApprovalManager;
import bad.openclosed.HealthInsuranceSurveyor;
import bad.openclosed.VehicleInsuranceSurveyor;
import good.Printer;
import good.SingleResponsibilityText;
import good.openclosed.InsuranceSurveyor;

public class Main {
    public static void main(String[] args) {
        runGoodClaimApproval();
    }

    static void runGoodClaimApproval() {
        InsuranceSurveyor surveyor1 = new good.openclosed.HealthInsuranceSurveyor();
        var claimApprovalManager = new good.openclosed.ClaimApprovalManager();
        claimApprovalManager.processClaim(surveyor1);
        // vehicle
        InsuranceSurveyor surveyor2 = new good.openclosed.VehicleInsuranceSurveyor();
        claimApprovalManager.processClaim(surveyor2);
    }

    static void runBadClaimApproval() {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();
        claimApprovalManager.processHealthClaim(healthInsuranceSurveyor);
        // vehicle
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        claimApprovalManager.processVehicleClaim(vehicleInsuranceSurveyor);
    }

    static void runMultipleResponsibility() {
        MultipleResponsibilityText multipleResponsibilityText = new MultipleResponsibilityText();
        multipleResponsibilityText.setText("Jabulani jabulani Africa");
        multipleResponsibilityText.setAuthor("Gil");

        multipleResponsibilityText.printText();
        multipleResponsibilityText.printFirst(5);

        // modify
        multipleResponsibilityText.allLettersToUpperCase();
        multipleResponsibilityText.printText();
        multipleResponsibilityText.allLettersToLowerCase();
        multipleResponsibilityText.printFirst(10);
    }

    static void runSingleResponsibility() {
        SingleResponsibilityText singleResponsibilityText = new SingleResponsibilityText();
        singleResponsibilityText.setText("Bwendowoza jenvude mukwano oyinza okunumya");
        singleResponsibilityText.setAuthor("Rob");

        Printer printer = new Printer(singleResponsibilityText);

        printer.printText();
        printer.printFirst(7);

        // modify
        singleResponsibilityText.allLettersToUpperCase();
        printer.printText();
        singleResponsibilityText.allLettersToLowerCase();
        printer.printFirst(20);
    }
}
