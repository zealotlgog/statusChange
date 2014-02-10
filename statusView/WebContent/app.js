
//@require @packageOverrides
Ext.Loader.setConfig({
    enabled: true
});

Ext.application({
    views: [
        'MyContainer'
    ],
    autoCreateViewport: true,
    name: 'MyApp'
});
