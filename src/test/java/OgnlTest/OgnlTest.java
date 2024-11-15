package OgnlTest;

import java.lang.reflect.Member;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import ognl.AbstractMemberAccess;
import ognl.DefaultClassResolver;
import ognl.MemberAccess;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest {

    @Test
    public void test_string_equals() throws OgnlException {

        String conditionExpress = "\"aaa\".equals(params[0].flowAttribute.getBxApp())";

//        conditionExpress = "params[0].flowAttribute.getBxApp().equals(\"aaa\")";

        FlowContext context = new FlowContext();

        Object[] params = new Object[4];
        params[0] = context;

        Advice advice = new Advice();
        advice.setParams(params);

        MemberAccess memberAccess = new AbstractMemberAccess() {
            public boolean isAccessible(Map context, Object target, Member member, String propertyName) {
                return true;
            }

            public boolean isAccessible(OgnlContext context, Object target, Member member, String propertyName) {
                return true;
            }
        };

        OgnlContext ognlContext = new OgnlContext(memberAccess, new DefaultClassResolver(), null, null);

        Object object = Ognl.getValue(conditionExpress, ognlContext, advice);

        System.out.println(conditionExpress + ", result: " + object);

        Assert.isTrue((boolean) object, "");
    }

    @Test
    public void test_object_equals() throws OgnlException {

        String conditionExpress = "params[0].flowAttribute.getBxApp().equals(\"aaa\")";

        FlowContext context = new FlowContext();

        Object[] params = new Object[4];
        params[0] = context;

        Advice advice = new Advice();
        advice.setParams(params);

        MemberAccess memberAccess = new AbstractMemberAccess() {
            public boolean isAccessible(Map context, Object target, Member member, String propertyName) {
                return true;
            }

            public boolean isAccessible(OgnlContext context, Object target, Member member, String propertyName) {
                return true;
            }
        };

        OgnlContext ognlContext = new OgnlContext(memberAccess, new DefaultClassResolver(), null, null);

        Object object = Ognl.getValue(conditionExpress, ognlContext, advice);

        System.out.println(conditionExpress + ", result: " + object);

        Assert.isTrue((boolean) object, "");
    }

    @Test
    public void test_equal_sign() throws OgnlException {

        String conditionExpress = "\"aaa\" == params[0].flowAttribute.getBxApp()";

//        conditionExpress = "params[0].flowAttribute.getBxApp().equals(\"aaa\")";

        FlowContext context = new FlowContext();

        Object[] params = new Object[4];
        params[0] = context;

        Advice advice = new Advice();
        advice.setParams(params);

        MemberAccess memberAccess = new AbstractMemberAccess() {
            public boolean isAccessible(Map context, Object target, Member member, String propertyName) {
                return true;
            }

            public boolean isAccessible(OgnlContext context, Object target, Member member, String propertyName) {
                return true;
            }
        };

        OgnlContext ognlContext = new OgnlContext(memberAccess, new DefaultClassResolver(), null, null);

        Object object = Ognl.getValue(conditionExpress, ognlContext, advice);

        System.out.println(conditionExpress + ", result: " + object);

        Assert.isTrue((boolean) object, "");
    }
}
