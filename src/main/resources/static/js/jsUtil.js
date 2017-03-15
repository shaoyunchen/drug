/**
 * Created by shaoyun_book on 2017/3/15.
 */
var zeroEsc=true;
var zeroList=[];
var gps={
    logLevel:1,/*1普通（打印全部Log），2中等（打印Error&Warning Log），3高级（只打印ErrorLog）*/
    searchFast:200,
    searchNormal:500,
}
$(function(){
    initZeroModalEscOut();
    $('input').attr('autocomplete','off');
});
function disableSelect(){
    var event= getEvent();
    event.preventDefault();
    var element=getEventElement();
    element.blur();
}
function log(obj){
    if(gps.logLevel==1&&obj){
        console.log(obj);
    }
}
function parentFrameResize(moreHeight){
    parent.document.all("autoFrame").style.height=(document.body.clientHeight + moreHeight||0)+"px";
}
function redirect(url){
    location.href=url;
}
function pageReload(){
    location.reload();
}

function logWarning(obj){
    if(gps.logLevel<=2&&obj){
        console.log(obj);
    }
}
function logError(obj){
    console.log(obj);
}
function myAjax(url,data,succfunc,errorfunc){
    $.ajax({
        type: "post",
        cache:false,
        url: url,
        data: data,
        dataType: "json",
        success: succfunc,
        error:errorfunc
    });
}

function pageReload(){
    location.reload();
}

function getIENum(){
    if(navigator.userAgent.indexOf("MSIE")>0){
        if(navigator.userAgent.indexOf("MSIE 6.0")>0)
        {
            return 6;
        }
        if(navigator.userAgent.indexOf("MSIE 7.0")>0)
        {

            return 7;
        }
        if(navigator.userAgent.indexOf("MSIE 8.0")>0)
        {
            return 8;
        }
        if(navigator.userAgent.indexOf("MSIE 9.0")>0)
        {
            return 9;
        }
        if(navigator.userAgent.indexOf("MSIE 10.0")>0)
        {
            return 10;
        }
    }else{
        return 100
    }
}

function showAlert(title,text,type){
    if(type==="success"){
        showZeroModalSuccess(text);
    }else if(type==="error"){
        showZeroModalError(text);
    }else if(type==="info"){
        showZeroModalInfo(text);
    }
}

function showAlertCallBack(title,text,type,showCancelButton,confirmFunc,cancelFunc,otherFunc){
    showZeroModalConfirm(title,text,confirmFunc,cancelFunc);
}

function showZeroModal(title,text,width,height,okFunc,cancelFunc,onComplete,onClosed){
    var opt={
        title:title,
        content:text,
        width:width,
        height:height,
        ok:true,
        okFn:okFunc,
        cancel:true,
        cancelFn:cancelFunc,
        onComplete:onComplete,
        onClosed:onClosed
    };
    zeroList.push(zeroModal.show(opt));
    $('div.zeromodal-container[zero-unique-container='+zeroList[zeroList.length-1]+'] iframe').focus();
    return zeroList[zeroList.length-1];
}
function initZeroModalEscOut(func){
    $(document).keydown(function(event){
        var theEvent = event || window.event;
        var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
        if(code==27){
            if(parent.zeroList.length>0){
                if(parent.zeroEsc){
                    parent.closeZeroModal(true);
                }
            }
        }
    });
}

function showZeroModalSuccess(text){
    if(text){
        return zeroModal.success(text);
    } else
        return zeroModal.success("操作成功");
}

function showZeroModalSuccessCallBack(content,okFun,cancelFun){
    var opt={
        content:content||"操作成功",
        okFn:okFun,
        cancel:false
    };
    if(cancelFun){
        opt.cancel=true;
        opt.cancelFn=cancelFun;
    }
    return zeroModal.success(opt);
}

function showZeroModalError(title,text){
    var opt={
        content:title||'操作失败',
        contentDetail:text||''
    };
    zeroModal.error(opt);
}

function showZeroModalConfirm(title,text,okFn,cancelFn){
    return zeroModal.confirm({
        content:title,
        contentDetail:text,
        okFn:okFn,
        cancelFn:cancelFn
    });
}

function showZeroModalInfo(title,text,okFn,cancelFn){
    return zeroModal.alert({
        content:title,
        contentDetail:text,
        okFn:okFn,
        cancelFn:cancelFn
    });
}

function showZeroModalLoading(type){
    if(type)
        return zeroModal.loading(type);
    else
        return zeroModal.loading(3);
}

function showZeroModalUrl(url,title,width,height,isdiv,buttons) {
    var opt={
        title: title,
        iframe: true,
        url: url,
        width: '60%',
        height: '60%',
        cancel:true
        /*buttons: [{ className: 'zeromodal-btn zeromodal-btn-primary', name: '确定', fn:function(opt){closeZeroModal();}}]*/
    };
    if(width)
        opt.width=width;
    if(height)
        opt.height=height;
    if(isdiv)
        opt.iframe=false;
    if(buttons)
        opt.buttons=buttons;
    zeroList.push(zeroModal.show(opt));

    $('div.zeromodal-container[zero-unique-container='+zeroList[zeroList.length-1]+'] iframe').focus();

    return zeroList[zeroList.length-1];
}

function showZeroModalUrlWithoutBtn(url,title,width,height,isdiv) {
    var opt={
        title: title,
        iframe: true,
        url: url,
        width: '60%',
        height: '60%',
        ok:false,
        cancel:false
    };
    if(width)
        opt.width=width;
    if(height)
        opt.height=height;
    if(isdiv)
        opt.iframe=false;
    zeroList.push(zeroModal.show(opt));
    $('div.zeromodal-container[zero-unique-container='+zeroList[zeroList.length-1]+'] iframe').focus();

    return zeroList[zeroList.length-1];
}

var closeZeroModal = function(id){
    if(id){
        if(zeroList.length){
            zeroModal.close(zeroList.pop());
            $('div.zeromodal-container[zero-unique-container='+zeroList[zeroList.length-1]+'] iframe').focus();
        }else
            zeroModal.closeAll();
    }else{
        zeroModal.closeAll();
        zeroList=[];
    }
};

onlyFloatNumKeyUp=function(e){
    if(e===undefined){
        e=window.event;
    }
    var oInput=e.srcElement?e.srcElement:e.target;
    if('' != oInput.value.replace(/\d{1,}\.{0,1}\d{0,}/,''))
    {
        oInput.value = oInput.value.match(/\d{1,}\.{0,1}\d{0,}/) == null ? '' :oInput.value.match(/\d{1,}\.{0,1}\d{0,}/);
    }
}

/*
 * 只能输入正整数,不能有小数点
 *
 */
onlyIntegerKeyUp=function(e){
    if(e===undefined){
        e=window.event;
    }
    var obj=e.srcElement?e.srcElement:e.target;
    var pattern = /[^\d]/ig;
    var val=obj.value;
    if(pattern.test(val)) {
        var i=getCursortPosition(e);
        obj.value=val.replace(pattern,'');
        setCaretPosition(e,i);
    }
};
/*******************************************************************************
 * 获取光标位置
 *
 * @param ctrl
 * @returns {Number}
 */
getCursortPosition=function(event) { /*获取光标位置函数 */
    if (event === undefined || event === null) {
        event = arguments.callee.caller.arguments[0] || window.event;
    }
    var obj = event.srcElement?event.srcElement:event.target;
    var CaretPos = 0;  /*IE Support  */
    if (document.selection) {
        obj.focus ();
        var Sel = document.selection.createRange ();
        Sel.moveStart ('character', -obj.value.length);
        CaretPos = Sel.text.length;
    } else if (obj.selectionStart || obj.selectionStart == '0'){
        /*Firefox support  */
        CaretPos = obj.selectionStart;
    }

    return (CaretPos);
}

setCaretPosition=function(event, pos){/*// 设置光标位置函数  */
    if (event === undefined || event === null) {
        event = arguments.callee.caller.arguments[0] || window.event;
    }
    var obj = event.srcElement?event.srcElement:event.target;
    if (pos > 0) {
        pos = pos - 1;/*//因为把不匹配的字符删除之后,光标会往后移动一个位置  */
    }
    if(obj.setSelectionRange){
        obj.focus();
        obj.setSelectionRange(pos,pos);
    } else if (obj.createTextRange) {
        var range = obj.createTextRange();
        range.collapse(true);
        range.moveEnd('character', pos);
        range.moveStart('character', pos);
        range.select();
    }
}

onlyNumAndAlphKeyUp=function(event){
    if(event===undefined){
        event=window.event;
    }
    var obj=event.srcElement?event.srcElement:event.target;
    var pattern = /[^\w]/ig;
    if(pattern.test(obj.value)) {
        var i=getCursortPosition(event);
        obj.value=obj.value.replace(pattern,'');
        setCaretPosition(event,i);
    }
}

function getTd(data,cls){
    var td=document.createElement("td");
    if(cls){
        td.setAttribute('class',cls);
    }
    td.innerHTML=(data);
    return td;
}

function getTh(data){
    var th=document.createElement("th");
    th.style="text-align:center";
    th.innerHTML=(data);
    return th;
}


function clone(obj){
    var o;
    switch(typeof obj){
        case 'undefined': break;
        case 'string'   : o = obj + '';break;
        case 'number'   : o = obj - 0;break;
        case 'boolean'  : o = obj;break;
        case 'object'   :
            if(obj === null){
                o = null;
            }else{
                if(obj instanceof Array){
                    o = [];
                    for(var i = 0, len = obj.length; i < len; i++){
                        o.push(clone(obj[i]));
                    }
                }else{
                    o = {};
                    for(var k in obj){
                        o[k] = clone(obj[k]);
                    }
                }
            }
            break;
        default:
            o = obj;break;
    }
    return o;
}

Date.prototype.format = function(format){
    if(!format)
        format="yyyy-MM-dd hh:mm:ss";
    var o = {
        "M+" : this.getMonth()+1,
        "d+" : this.getDate(),
        "h+" : this.getHours(),
        "m+" : this.getMinutes(),
        "s+" : this.getSeconds(),
        "q+" : Math.floor((this.getMonth()+3)/3),
        "S" : this.getMilliseconds()
    }

    if(/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));
    }

    for(var k in o) {
        if(new RegExp("("+ k +")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
        }
    }
    return format;
}

function isExitsFunction(funcName) {
    try {
        if (typeof (eval(funcName)) == "function") {
            return true;
        }
    } catch (e) {
    }
    return false;
}
function isExitsVariable(variableName) {
    try {
        if (typeof (variableName) == "undefined") {
            return false;
        } else {
            return true;
        }
    } catch (e) {
    }
    return false;
}

function enterListener(event,callBack) {
    /*兼容FF和IE和Opera*/
    var theEvent = event || window.event;
    var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    if (code == 13) {
        callBack();
        return false;
    }
    return true;
}
function goWithDelay(event,callBack,delayTime){
    lastKeyupTimeStamp=event.timeStamp;
    var delay=isNaN(delayTime)?gps.searchNormal:delayTime;
    delay=delay||gps.searchNormal;
    window.setTimeout(function(){
        if(event.timeStamp-lastKeyupTimeStamp==0){
            callBack();
        }
    },delay);
}

function simulateKeyPress(element,code, bctrl){
    var keyEvent = jQuery.Event("keydown");
    keyEvent.keyCode=code;
    if(bctrl){
        keyEvent.ctrlKey=true;
    }
    if(element instanceof jQuery){
        element.trigger(keyEvent);
    }else{
        $(element).trigger(keyEvent);
    }
}
function keyListener(keyCode,func){
    var theEvent = event || window.event;
    var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    if(code==keyCode){
        func();
        return false;
    }
}

/**
 * 验证日期
 * 不仅仅匹配了日期格式，而且对日期的逻辑做了严格要求，判断了大月31天，小月30天，2月28，闰年情况2月29天
 */
function isNotDate(date){
    var reg = /((^((1[8-9]\d{2})|([2-9]\d{3}))([-\/\._])(10|12|0?[13578])([-\/\._])(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))([-\/\._])(11|0?[469])([-\/\._])(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))([-\/\._])(0?2)([-\/\._])(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)([-\/\._])(0?2)([-\/\._])(29)$)|(^([3579][26]00)([-\/\._])(0?2)([-\/\._])(29)$)|(^([1][89][0][48])([-\/\._])(0?2)([-\/\._])(29)$)|(^([2-9][0-9][0][48])([-\/\._])(0?2)([-\/\._])(29)$)|(^([1][89][2468][048])([-\/\._])(0?2)([-\/\._])(29)$)|(^([2-9][0-9][2468][048])([-\/\._])(0?2)([-\/\._])(29)$)|(^([1][89][13579][26])([-\/\._])(0?2)([-\/\._])(29)$)|(^([2-9][0-9][13579][26])([-\/\._])(0?2)([-\/\._])(29)$))/ig;
    if(!reg.test(date)){
        return true;
    }
    return false;
}

function getEvent(event){
    return event || window.event || arguments.callee.caller.arguments[0];
}

function getEventElement(event){
    var theEvent = getEvent(event);
    return theEvent.target||theEvent.srcElement;
}

function getEventCode(event){
    var theEvent = getEvent(event);
    return theEvent.keyCode||theEvent.which||theEvent.charCode;
}

function initDateGroup(){
    $('#year,#month,#day').bind('input',function(){
        var element=getEventElement();
        var value = element.value;
        var id='';
        if(element.id=='year'){
            if(value.length==4)
                $(element).next().focus();
        }else{
            if(value.length==2)
                $(element).next().focus();
        }
    });
    $('#year,#month,#day').bind('keydown',function(){
        var cursorIndex = getCursortPosition();
        var element = getEventElement();
        var keyCode = getEventCode();
        if(cursorIndex==0&&(keyCode==37||keyCode==38||keyCode==8)){
            if($(element).prev()){
                window.setTimeout(function(){
                    $(element).prev().focus();
                },50);
            }
        }else if(cursorIndex==getEventElement().value.length&&(keyCode==39||keyCode==40)){
            if($(element).next()){
                window.setTimeout(function(){
                    $(element).next().focus();
                },50);
            }
        }
    });
}

function showSimpleBox(title,data,okFunc,width,height){
    var box=$('<div></div>');
    for(i=0;i<data.length;i++){
        var p = getSimpleBoxRow(data[i]);
        p.appendTo(box);
    }
    var opt={
        title:title,
        content:box[0],
        width:"500px",
        height:140+data.length*31+'px',
        ok:true,
        okFn:okFunc,
        cancel:true,
        esc:true
    };
    if(width)
        opt.width=width;
    if(height)
        opt.height=height;
    parent.zeroModal.show(opt);
}
function getSimpleBoxRow(data){
    var p=$('<p></p>');
    var name=$('<label>'+data.name+'：</label>');
    var value=$("<span id='"+data.id+"'>"+data.value+"</span>");
    if(data.isInput){
        value=$("<input type='text' id='"+data.id+"' value='"+data.value+"' class='input-normal'>");
    }
    name.appendTo(p);
    value.appendTo(p);
    return p;
}
function initZeroModalEscOut(){
    $(document).keydown(function(event){
        var code = getEventCode(event);
        if(code==27){
            parent.closeZeroModal(1);
        }
    });
}
function nullFunc(){}