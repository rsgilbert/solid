package bad.openclosed;

public class ClaimApprovalManager {
    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval");
        }
    }
    // bad. We are modifying an existing software module to support
    // the new functionality of vehicle insurance survey
    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Processing approval");
        }
        else {
            System.out.println("ClaimApprovalManager: Bad claim. Approval denied");
        }
    }
}
