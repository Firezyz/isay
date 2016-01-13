package com.firezyz.isay.web.model;

import java.util.Date;

/**
 * Created by apple on 1/12/16.
 */
public class Article {
    private Long id;
    private String title;
    private String markdown;
    private String html;
    private String tag;
    private Date created;
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", markdown='" + markdown + '\'' +
                ", html='" + html + '\'' +
                ", tag='" + tag + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
