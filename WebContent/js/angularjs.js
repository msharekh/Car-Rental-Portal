
var app = angular.module('carRentalApp', []);
/*app.controller('addCarCtrl', function ($scope) {
    $scope.title = "Add Car";
    $scope.formtitle = "Add Car Form";
    $scope.title_short = "AC";

});*/
app.controller('carsCtrl', function ($scope) {
    $scope.title = "Car List";
    $scope.formtitle = "Car List";
    $scope.title_short = "CL";

});
app.controller('customersCtrl', function ($scope) {
    $scope.title = "Customer List";
    $scope.formtitle = "Customer List";
    $scope.title_short = "ACS";

});
app.controller('rentCtrl', function ($scope) {
    $scope.title = "Rent Car";
    $scope.formtitle = "Rent Car Form";
    $scope.title_short = "RC";

});
