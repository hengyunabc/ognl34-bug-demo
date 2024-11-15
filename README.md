

## ognl 3.4.3 result

```
"aaa".equals(params[0].flowAttribute.getBxApp()), result: false
"aaa" == params[0].flowAttribute.getBxApp(), result: true
params[0].flowAttribute.getBxApp().equals("aaa"), result: true
```

## ognl 3.3.5 result

```
"aaa".equals(params[0].flowAttribute.getBxApp()), result: true
"aaa" == params[0].flowAttribute.getBxApp(), result: true
params[0].flowAttribute.getBxApp().equals("aaa"), result: true
```