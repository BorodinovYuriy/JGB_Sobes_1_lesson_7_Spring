angular.module('app',[]).controller('indexController', function($scope, $http){

    const contextPath = 'http://localhost:8189/app/api/v1/students';

/*запрос списка студентов*/
    $scope.fillTable = function() {
        $http.get(contextPath)
            .then(function(response) {
            $scope.studentList = response.data;
            });
    };
//Добавление студента
    $scope.submitCreateNewStudent = function(){
                $http.post(contextPath, $scope.newStudent)
                    .then(function(response) {
                     $scope.studentList = response.data;
                     /*location.reload();*/
                });
    };

//Удаление студента
    $scope.deleteStudentById = function(id){
            $http.delete(contextPath + '/' + id)
            .then(function(response) {
                $scope.studentList = response.data;
                /*location.reload();*/
            });
    };

    $scope.fillTable();

});
