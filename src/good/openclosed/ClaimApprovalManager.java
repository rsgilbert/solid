package good.openclosed;

import bad.openclosed.HealthInsuranceSurveyor;
import bad.openclosed.VehicleInsuranceSurveyor;

/**
 * Follows Open/Closed principle.
 * Open to process claims of various types.
 * CLosed in that it does not need to be modified when new types of insurance claims are added.
 */
public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval");
        }
        else {
            System.out.println("ClaimApprovalManager: Bad claim. Approval denied");
        }
    }
}
