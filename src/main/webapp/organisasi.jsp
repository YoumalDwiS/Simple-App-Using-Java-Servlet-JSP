<head>
    <meta charset="UTF-8">
    <title>Daftar Organisasi</title>
</head>
<body>
<h1>Daftar Organisasi</h1>
<form action="OrganisasiServlet" method="post">
    <table>
        <tr>
            <td>
                Nama Lengkap
            </td>
            <td><input type="text" name="nama" value=""></td>
        </tr>
        <tr>
            <td>
                Organisasi
            </td> <br>
            <td>
                <input type="checkbox" id="organisasi1" name="daftarOrganisasi" value="MPM">
                <label for="organisasi1">MPM</label> <br>
                <input type="checkbox" id="organisasi2" name="daftarOrganisasi" value="BEM">
                <label for="organisasi2">BEM</label><br>
                <input type="checkbox" id="organisasi3" name="daftarOrganisasi" value="Himma">
                <label for="organisasi3">Himma</label><br>
                <input type="checkbox" id="organisasi4" name="daftarOrganisasi" value="UKM Robotik">
                <label for="organisasi4">UKM Robotik</label><br>
                <input type="checkbox" id="organisasi5" name="daftarOrganisasi" value="UKM Jurnalistik">
                <label for="organisasi5">UKM Jurnalistik</label><br>
                <input type="checkbox" id="organisasi6" name="daftarOrganisasi" value="UKM Badminton">
                <label for="organisasi6">UKM Badminton</label><br>
                <input type="checkbox" id="organisasi7" name="daftarOrganisasi" value="UKM Rohis">
                <label for="organisasi7">UKM Rohis</label><br>
                <input type="checkbox" id="organisasi8" name="daftarOrganisasi" value="UKM Mapatra">
                <label for="organisasi8">UKM Mapatra</label><br>
                <input type="checkbox" id="organisasi9" name="daftarOrganisasi" value="UKM KMK">
                <label for="organisasi9">UKM KMK</label><br>
                <input type="checkbox" id="organisasi10" name="daftarOrganisasi" value="UKM KIM">
                <label for="organisasi10">UKM KIM</label><br>
                <input type="checkbox" id="organisasi11" name="daftarOrganisasi" value="UKM Vopma">
                <label for="organisasi11">UKM Vopma</label><br>
            </td>
        </tr>
    </table>
    <input type="submit" value="Simpan">
</form>
</body>
</html>