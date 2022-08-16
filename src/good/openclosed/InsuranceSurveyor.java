package good.openclosed;

/**
 * Implementing support for insurance claims using the Open/Closed principle.
 * Open to support more types of insurance claims.
 * Closed for any modifications whenever support for a new type of claim is added.
 */
public abstract class InsuranceSurveyor {
    public abstract boolean isValidClaim();
}
