package com.vue.model;

import java.util.Date;

public class DisWorkordersign {
    private Short id;

    private Short workorderid;

    private String worksheetno;

    private Short workordertype;

    private Short signtype;

    private Short courierint;

    private String couriername;

    private String recipient;

    private Short signunit;

    private Date signtime;

    private Short invalidatemark;

    private String abnormalmark;

    private Short inputpersoncode;

    private Short inputpersonid;

    private Short inputid;

    private Date inputtime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getWorkorderid() {
        return workorderid;
    }

    public void setWorkorderid(Short workorderid) {
        this.workorderid = workorderid;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Short getWorkordertype() {
        return workordertype;
    }

    public void setWorkordertype(Short workordertype) {
        this.workordertype = workordertype;
    }

    public Short getSigntype() {
        return signtype;
    }

    public void setSigntype(Short signtype) {
        this.signtype = signtype;
    }

    public Short getCourierint() {
        return courierint;
    }

    public void setCourierint(Short courierint) {
        this.courierint = courierint;
    }

    public String getCouriername() {
        return couriername;
    }

    public void setCouriername(String couriername) {
        this.couriername = couriername == null ? null : couriername.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public Short getSignunit() {
        return signunit;
    }

    public void setSignunit(Short signunit) {
        this.signunit = signunit;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Short getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(Short invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public String getAbnormalmark() {
        return abnormalmark;
    }

    public void setAbnormalmark(String abnormalmark) {
        this.abnormalmark = abnormalmark == null ? null : abnormalmark.trim();
    }

    public Short getInputpersoncode() {
        return inputpersoncode;
    }

    public void setInputpersoncode(Short inputpersoncode) {
        this.inputpersoncode = inputpersoncode;
    }

    public Short getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(Short inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    public Short getInputid() {
        return inputid;
    }

    public void setInputid(Short inputid) {
        this.inputid = inputid;
    }

    public Date getInputtime() {
        return inputtime;
    }

    public void setInputtime(Date inputtime) {
        this.inputtime = inputtime;
    }
}