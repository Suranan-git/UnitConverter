<!DOCTYPE html>
<html>
<head>
    <title>Unit Converter</title>
</head>
<body>
<h2>Length Unit Converter</h2>

<form action="convert" method="get">
    Value:
    <input type="number" step="any" name="value" required>
    <br><br>

    From:
    <select name="fromUnit">
        <option value="mm">Millimeter</option>
        <option value="cm">Centimeter</option>
        <option value="m">Meter</option>
        <option value="km">Kilometer</option>
        <option value="inch">Inch</option>
        <option value="foot">Foot</option>
        <option value="yard">Yard</option>
        <option value="mile">Mile</option>
    </select>
    <br><br>

    To:
    <select name="toUnit">
        <option value="mm">Millimeter</option>
        <option value="cm">Centimeter</option>
        <option value="m">Meter</option>
        <option value="km">Kilometer</option>
        <option value="inch">Inch</option>
        <option value="foot">Foot</option>
        <option value="yard">Yard</option>
        <option value="mile">Mile</option>
    </select>
    <br><br>

    <input type="submit" value="Convert">
</form>
</body>
</html>
