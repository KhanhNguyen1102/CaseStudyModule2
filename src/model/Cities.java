package model;

import java.util.Locale;
import java.util.TreeMap;

public class Cities {
    public static TreeMap<String, String> cities1;
    public static TreeMap<String, String> cities2;

    static {
        Cities listCities = Cities.getInstance();
    }

    private Cities() {
        cities1 = new TreeMap<>();
        cities1.put("hòa bình", "w02");
        cities1.put("nghệ an", "w03");
        cities1.put("vinh", "w03");
        cities1.put("hà tĩnh", "w04");
        cities1.put("quảng bình", "w05");
        cities1.put("đồng hới", "w05");
        cities1.put("quảng trị", "w06");
        cities1.put("đông hà", "w06");
        cities1.put("huế", "w07");
        cities1.put("quảng ngãi", "w08");
        cities1.put("khánh hòa", "w09");
        cities1.put("cam ranh", "w09");
        cities1.put("nha trang", "w09");
        cities1.put("bình thuận", "w10");
        cities1.put("phan thiết", "w10");
        cities1.put("kon tum", "w11");
        cities1.put("gia lai", "w12");
        cities1.put("pleiku", "w12");
        cities1.put("đắk lắk", "w13");
        cities1.put("buôn ma thuật", "w13");
        cities1.put("lâm đồng", "w13");
        cities1.put("bảo lộc", "w14");
        cities1.put("đà lạt", "w14");
        cities1.put("hồ chí minh", "w15");
        cities1.put("bình dương", "w16");
        cities1.put("thủ dầu một", "w16");
        cities1.put("thuận an", "w16");
        cities1.put("dĩ an", "w16");
        cities1.put("ninh bình", "w17");
        cities1.put("tam điệp", "w17");
        cities1.put("thái bình", "w18");
        cities1.put("hải dương", "w19");
        cities1.put("hà nam", "w20");
        cities1.put("phủ lý", "w20");
        cities1.put("long an", "w21");
        cities1.put("tân an", "w21");
        cities1.put("đồng tháp", "w22");
        cities1.put("cao lãnh", "w22");
        cities1.put("sa đéc", "w22");
        cities1.put("hồng ngự", "w22");
        cities1.put("tiền giang", "w23");
        cities1.put("mỹ tho", "w23");
        cities1.put("bến tre", "w24");
        cities1.put("trà vinh", "w25");
        cities1.put("cần thơ", "w26");
        cities1.put("sóc trăng", "w27");
        cities1.put("hà nội", "w28");
        cities1.put("bạc liêu", "w29");
        cities1.put("bình phước", "w30");
        cities1.put("đồng xoài", "w30");
        cities1.put("vũng tàu", "w31");
        cities1.put("đồng nai", "w32");
        cities1.put("biên hòa", "w32");
        cities1.put("long khánh", "w32");
        cities1.put("hưng yên", "w33");
        cities1.put("nam định", "w34");
        cities1.put("tây ninh", "w35");
        cities1.put("hà giang", "w36");
        cities1.put("lào cai", "w37");
        cities1.put("sapa", "w37");
        cities1.put("điện biên phủ", "w38");
        cities1.put("đắk nông", "w39");
        cities1.put("hậu giang", "w40");
        cities1.put("vị thanh", "w40");
        cities1.put("ngã bảy", "w40");
        cities1.put("kiên giang", "w41");
        cities1.put("hà tiên", "w41");
        cities1.put("rạch giá", "w41");
        cities1.put("phú quốc", "w41");
        cities1.put("cà mau", "w42");
        cities1.put("phú thọ", "w43");
        cities1.put("việt trì", "w43");
        cities1.put("vĩnh phúc", "w44");
        cities1.put("phúc yên", "w44");
        cities1.put("vĩnh yên", "w44");
        cities1.put("sơn la", "w45");
        cities1.put("bắc giang", "w46");
        cities1.put("bắc ninh", "w47");
        cities1.put("lạng sơn", "w48");
        cities1.put("cao bằng", "w49");
        cities1.put("tuyên quang", "w50");
        cities1.put("thái nguyên", "w51");
        cities1.put("sông công", "w51");
        cities1.put("bắc kạn", "w52");
        cities1.put("yên bái", "w53");
        cities1.put("hải phòng", "w54");
        cities1.put("đà nẵng", "w55");
        cities1.put("bình định", "w56");
        cities1.put("quy nhơn", "w56");
        cities1.put("vĩnh long", "w57");
        cities1.put("an giang", "w58");
        cities1.put("châu đốc", "w58");
        cities1.put("long xuyên", "w58");
        cities1.put("phú yên", "w59");
        cities1.put("tuy hòa", "w59");
        cities1.put("ninh thuận", "w60");
        cities1.put("phan rang", "w60");
        cities1.put("thanh hóa", "w61");
        cities1.put("sầm sơn", "w61");
        cities1.put("quảng nam", "w62");
        cities1.put("hội an", "w62");
        cities1.put("tam kỳ", "w62");
        cities1.put("quảng ninh", "w63");
        cities1.put("cẩm phả", "w63");
        cities1.put("hạ long", "w63");
        cities1.put("móng cái", "w63");
        cities1.put("uông bí", "w63");
        cities1.put("lai châu", "w64");
        cities2 = new TreeMap<>();
        cities2.put("hòa bình", "thanh-pho-hoa-binh");
        cities2.put("nghệ an", "vinh");
        cities2.put("vinh", "vinh");
        cities2.put("hà tĩnh", "ha-t-nh");
        cities2.put("quảng bình", "dong-hoi");
        cities2.put("đồng hới", "dong-hoi");
        cities2.put("quảng trị", "dong-ha");
        cities2.put("đông hà", "dong-ha");
        cities2.put("huế", "hu");
        cities2.put("quảng ngãi", "quang-ngai");
        cities2.put("khánh hòa", "cam-ranh");
        cities2.put("cam ranh", "cam-ranh");
        cities2.put("nha trang", "nha-trang");
        cities2.put("bình thuận", "phan-thiet");
        cities2.put("phan thiết", "phan-thiet");
        cities2.put("kon tum", "kon-tum");
        cities2.put("gia lai", "pleiku");
        cities2.put("pleiku", "pleiku");
        cities2.put("đắk lắk", "buon-ma-thuot");
        cities2.put("buôn ma thuật", "buon-ma-thuot");
        cities2.put("lâm đồng", "bao-loc");
        cities2.put("bảo lộc", "bao-loc");
        cities2.put("đà lạt", "da-lat");
        cities2.put("hồ chí minh", "ho-chi-minh");
        cities2.put("bình dương", "thu-dau-mot");
        cities2.put("thủ dầu một", "thu-dau-mot");
        cities2.put("thuận an", "thu-dau-mot");
        cities2.put("dĩ an", "thu-dau-mot");
        cities2.put("ninh bình", "thanh-pho-ninh-binh");
        cities2.put("tam điệp", "thanh-pho-ninh-binh");
        cities2.put("thái bình", "thanh-pho-thai-binh");
        cities2.put("hải dương", "hai-duong");
        cities2.put("hà nam", "thanh-pho-phu-ly");
        cities2.put("phủ lý", "thanh-pho-phu-ly");
        cities2.put("long an", "tan-an");
        cities2.put("tân an", "tan-an");
        cities2.put("đồng tháp", "cao-lanh");
        cities2.put("cao lãnh", "cao-lanh");
        cities2.put("sa đéc", "sadek");
        cities2.put("hồng ngự", "cao-lanh");
        cities2.put("tiền giang", "m--tho");
        cities2.put("mỹ tho", "m--tho");
        cities2.put("bến tre", "b-n-tre");
        cities2.put("trà vinh", "tra-vinh");
        cities2.put("cần thơ", "can-tho");
        cities2.put("sóc trăng", "soc-trang");
        cities2.put("hà nội", "ha-noi");
        cities2.put("bạc liêu", "thanh-pho-bac-lieu");
        cities2.put("bình phước", "d-ng-xoai");
        cities2.put("đồng xoài", "d-ng-xoai");
        cities2.put("vũng tàu", "vung-tau");
        cities2.put("đồng nai", "bien-hoa");
        cities2.put("biên hòa", "bien-hoa");
        cities2.put("long khánh", "bien-hoa");
        cities2.put("hưng yên", "hung-yen");
        cities2.put("nam định", "nam-dinh");
        cities2.put("tây ninh", "tay-ninh");
        cities2.put("hà giang", "thanh-pho-ha-giang");
        cities2.put("lào cai", "lao-cai");
        cities2.put("sapa", "sa-pa");
        cities2.put("điện biên phủ", "dien-bien-phu");
        cities2.put("đắk nông", "quang-duc");
        cities2.put("hậu giang", "vi-thanh");
        cities2.put("vị thanh", "vi-thanh");
        cities2.put("ngã bảy", "vi-thanh");
        cities2.put("kiên giang", "ha-tien");
        cities2.put("hà tiên", "ha-tien");
        cities2.put("rạch giá", "rach-gia");
        cities2.put("phú quốc", "phu-quoc");
        cities2.put("cà mau", "ca-mau");
        cities2.put("phú thọ", "vi-t-tri");
        cities2.put("việt trì", "vi-t-tri");
        cities2.put("vĩnh phúc", "vinh-yen");
        cities2.put("phúc yên", "vinh-yen");
        cities2.put("vĩnh yên", "vinh-yen");
        cities2.put("sơn la", "son-la");
        cities2.put("bắc giang", "bac-giang");
        cities2.put("bắc ninh", "bac-ninh");
        cities2.put("lạng sơn", "lang-son");
        cities2.put("cao bằng", "cao-bang");
        cities2.put("tuyên quang", "thanh-pho-tuyen-quang");
        cities2.put("thái nguyên", "thai-nguyen");
        cities2.put("sông công", "thai-nguyen");
        cities2.put("bắc kạn", "bac-kan");
        cities2.put("yên bái", "yen-bai");
        cities2.put("hải phòng", "haiphong");
        cities2.put("đà nẵng", "da-nang");
        cities2.put("bình định", "quy-nhon");
        cities2.put("quy nhơn", "quy-nhon");
        cities2.put("vĩnh long", "v-nh-long");
        cities2.put("an giang", "cho-dok");
        cities2.put("châu đốc", "cho-dok");
        cities2.put("long xuyên", "long-xuyen");
        cities2.put("phú yên", "tuy-hoa");
        cities2.put("tuy hòa", "tuy-hoa");
        cities2.put("ninh thuận", "phan-rang-thap-cham");
        cities2.put("phan rang", "phan-rang-thap-cham");
        cities2.put("thanh hóa", "thanh-hoa");
        cities2.put("sầm sơn", "thanh-hoa");
        cities2.put("quảng nam", "hoi-an");
        cities2.put("hội an", "hoi-an");
        cities2.put("tam kỳ", "tam-ky");
        cities2.put("quảng ninh", "cam-pha");
        cities2.put("cẩm phả", "cam-pha");
        cities2.put("hạ long", "ha-long");
        cities2.put("móng cái", "mong-cai");
        cities2.put("uông bí", "thanh-pho-uong-bi");
        cities2.put("lai châu", "lai-chau");
    }

    public static Cities getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static String getCity(String city, TreeMap<String, String> cities) {
        String fixedString = city.trim().toLowerCase(Locale.ROOT);
        boolean isContain = cities.containsKey(fixedString);
        if (isContain) {
            return cities.get(fixedString);
        }
        return "fail";
    }

    private static class SingletonHelper {
        private static final Cities INSTANCE = new Cities();
    }

    public static TreeMap<String, String> getCities1() {
        return cities1;
    }

    public static void setCities1(TreeMap<String, String> cities1) {
        Cities.cities1 = cities1;
    }

    public static TreeMap<String, String> getCities2() {
        return cities2;
    }

    public static void setCities2(TreeMap<String, String> cities2) {
        Cities.cities2 = cities2;
    }

}
