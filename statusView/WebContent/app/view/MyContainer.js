Ext.define('MyApp.view.MyContainer', {
    extend: 'Ext.container.Container',

    height: 755,
    width: 1294,

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'panel',
                    height: 140,
                    layout: {
                        align: 'center',
                        pack: 'center',
                        type: 'hbox'
                    },
                    title: 'Control Panel',
                    items: [
                        {
                            xtype: 'panel',
                            flex: 1,
                            height: 117,
                            width: 1292,
                            layout: {
                                align: 'center',
                                pack: 'center',
                                type: 'vbox'
                            },
                            title: 'Import File',
                            items: [
                                {
                                    xtype: 'button',
                                    height: 52,
                                    width: 61,
                                    text: 'Import'
                                }
                            ]
                        },
                        {
                            xtype: 'panel',
                            flex: 1,
                            height: 117,
                            layout: {
                                align: 'center',
                                pack: 'center',
                                type: 'vbox'
                            },
                            title: 'Save',
                            items: [
                                {
                                    xtype: 'button',
                                    height: 52,
                                    width: 60,
                                    text: 'Save'
                                }
                            ]
                        },
                        {
                            xtype: 'panel',
                            flex: 1,
                            height: 115,
                            layout: {
                                align: 'center',
                                pack: 'center',
                                type: 'vbox'
                            },
                            title: 'Load Existing File',
                            items: [
                                {
                                    xtype: 'button',
                                    height: 50,
                                    width: 64,
                                    text: 'Load'
                                }
                            ]
                        }
                    ]
                },
                {
                    xtype: 'gridpanel',
                    height: 615,
                    title: 'Grid View',
                    columns: [
                        {
                            xtype: 'numbercolumn',
                            dataIndex: 'number',
                            text: 'Number'
                        },
                        {
                            xtype: 'gridcolumn',
                            dataIndex: 'name',
                            text: 'Name'
                        }
                    ]
                }
            ]
        });
        
        me.callParent(arguments);
    }

});