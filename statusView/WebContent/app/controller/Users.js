Ext.define('AM.controller.Users', {
    extend: 'Ext.app.Controller',

    views: [
        'AM.view.user.List',
        'AM.view.user.Edit',
    ],

    init: function() {
        this.control({
            'userlist': {
                itemdblclick: this.editUser
            }
        });
    },

    editUser: function(grid, record) {
        var view = Ext.widget('useredit');

        view.down('form').loadRecord(record);
    }
});