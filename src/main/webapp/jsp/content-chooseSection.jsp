<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="mainDiv col-sm-12 m-auto">
    <div class="container">
        <form class="myForm mt-3">
            <div class="row m-auto col-sm-12 d-block">
                <div class="pt-5 form-group text-center">
                    <h2 class="">SECTIONS</h2>
                </div>
            </div>
            <div class="row col-sm-6  m-auto p-3">
                <div class="dateDiv m-auto" id="conten">
                    <div class="form-group">
                        <input type="month" class="form-control" id="month" />
                    </div>
                </div>
            </div>
            <div class="row m-auto d-block pt-3">
                <div class="container">
                    <div class="col-sm-12 m-auto">
                        <table class="table-sm table-striped m-auto mt-3" id="tableClass">
                            <thead>
                            <tr>
                                <th>Date</th>
                                <th>Schedule</th>
                                <th>Class</th>
                                <th>Teacher</th>
                                <th class="lastCol"></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="list" items="${listOfClasses}">
                                <tr>
                                    <th scope="row">${list.classDays}</th>
                                    <td>${list.classStartTime}</td>
                                    <td>${list.styleName}</td>
                                    <td>Rafael & Amber</td>
                                    <td class="lastCol">
                                        <label class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input">
                                            <span class="custom-control-indicator"></span>
                                        </label>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="w-50 m-auto pt-3 pb-4">
                <button class="form-control btn-primary">Save</button>
            </div>
            <div class="w-50 m-auto pb-5">
                <button class="form-control btn-outline-danger">Cancel</button>
            </div>
        </form>
    </div>
</div>