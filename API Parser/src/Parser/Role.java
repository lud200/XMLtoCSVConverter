package Parser;
import org.jsefa.common.converter.EnumConstant;
public enum Role {
	@EnumConstant("senior developer")
    SENIOR_DEVELOPER,

    @EnumConstant("junior developer")
    JUNIOR_DEVELOPER,

    @EnumConstant("account manager")
    ACCOUNT_MANAGER,

    @EnumConstant("key account manager")
    KEY_ACCOUNT_MANAGER;
}
