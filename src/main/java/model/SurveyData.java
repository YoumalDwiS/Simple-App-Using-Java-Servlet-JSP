package model;

public class SurveyData {

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String[] getDaftarOrganisasi() {
        return daftarOrganisasi;
    }

    public void setDaftarOrganisasi(String[] daftarOrganisasi) {
        this.daftarOrganisasi = daftarOrganisasi;
    }

    private String nama;

    private String[] daftarOrganisasi;
}
