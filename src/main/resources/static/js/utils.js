function getUrlParam(paraName) {
    var url = document.location.toString();
    var arr0bj = url.split("?");
    if (arr0bj.length > 1) {
        var arrPara = arr0bj[1].split("&");
        var arr;
        for (var i = 0; i < arrPara.length; i++) {
            arr = arrPara[i].split("=");
            if (arr != null && arr[0] == paraName) {
                return arr[1];
            }
        }
        return "";
    } else {
        return "";
    }
}