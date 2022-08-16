package good.openclosed;

public class HealthInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validing health insurance claim");
        return true;
    }
}
