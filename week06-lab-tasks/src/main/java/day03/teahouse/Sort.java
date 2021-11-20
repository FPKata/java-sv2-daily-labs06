package day03.teahouse;

public enum Sort {
    BLACK_TEA("élénkítő hatású"), GREEN_TEA("méregtelenít"),
    ROOIBOS_TEA("tele van antioxidánsokkal"),
    HERBAL_TEA("sok különféle gyógyhatása van"), FRUIT_TEA("finom, édes ízű");

    private String additionInfo;

    Sort(String additionInfo) {
        this.additionInfo = additionInfo;
    }

    public String getAdditionInfo() {
        return additionInfo;
    }
}
