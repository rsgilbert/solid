package good.openclosed;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: surveying vehicle insurance claim");
        return false;
    }
}
