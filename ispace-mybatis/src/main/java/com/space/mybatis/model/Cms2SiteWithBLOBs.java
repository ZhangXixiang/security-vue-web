package com.space.mybatis.model;

public class Cms2SiteWithBLOBs extends Cms2Site {
    private String domainAlias;

    private String domainRedirect;

    public String getDomainAlias() {
        return domainAlias;
    }

    public void setDomainAlias(String domainAlias) {
        this.domainAlias = domainAlias == null ? null : domainAlias.trim();
    }

    public String getDomainRedirect() {
        return domainRedirect;
    }

    public void setDomainRedirect(String domainRedirect) {
        this.domainRedirect = domainRedirect == null ? null : domainRedirect.trim();
    }
}