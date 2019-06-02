
var app = angular.module('carRentalApp', []);
app.controller('addCarCtrl', function ($scope) {
    $scope.title = "Add Car";
    $scope.formtitle = "Add Car Form";
    $scope.title_short = "AC";

});
app.controller('addCustomerCtrl', function ($scope) {
    $scope.title = "Add Customer";
    $scope.formtitle = "Add Customer Form";
    $scope.title_short = "ACS";

});
app.controller('rentCarCtrl', function ($scope) {
    $scope.title = "Rent Car";
    $scope.formtitle = "Rent Car Form";
    $scope.title_short = "RC";

});
