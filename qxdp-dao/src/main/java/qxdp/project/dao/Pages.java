package qxdp.project.dao;

public class Pages {
    private Integer total;
    private Integer all;
    private Integer pagesize;
    private Integer page;

    /**
     * Gets the value of total.
     *
     * @return the value of total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the total.
     * You can use setTotal() to set the value of total
     *
     * @param total total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Gets the value of all.
     *
     * @return the value of all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * Sets the all.
     * You can use setAll() to set the value of all
     *
     * @param all all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

    /**
     * Gets the value of pagesize.
     *
     * @return the value of pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    /**
     * Sets the pagesize.
     * You can use setPagesize() to set the value of pagesize
     *
     * @param pagesize pagesize
     */
    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    /**
     * Gets the value of page.
     *
     * @return the value of page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the page.
     * You can use setPage() to set the value of page
     *
     * @param page page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    public Pages() {
    }

    public Pages(Integer total, Integer all, Integer pagesize, Integer page) {
        this.total = total;
        this.all = all;
        this.pagesize = pagesize;
        this.page = page;
    }
}
