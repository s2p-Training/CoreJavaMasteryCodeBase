# Java Date-Time API (`java.time`)

The `java.time` package (introduced in Java 8) provides a modern, immutable, and thread-safe API for handling date, time, and timezone operations.

---

## 1. LocalDate

Represents date only (year, month, day).

- No time information
- No timezone information
- Immutable and thread-safe

```java
LocalDate today = LocalDate.now();
LocalDate dob = LocalDate.of(1999, 5, 20);
```

---

## 2. LocalTime

Represents time only (hour, minute, second, nanosecond).

- No date information
- No timezone information

```java
LocalTime now = LocalTime.now();
LocalTime meetingTime = LocalTime.of(10, 30);
```

---

## 3. LocalDateTime

Represents date and time.

- No timezone information
- Combination of LocalDate and LocalTime

```java
LocalDateTime current = LocalDateTime.now();
```

---

## 4. ZonedDateTime

Represents date, time, timezone, and offset.

Contains:
- Date information
- Time information
- ZoneId
- Offset from UTC

```java
ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
```

---

## 5. OffsetDateTime

Represents date, time, and offset from UTC.

- Does not contain full timezone rules

```java
OffsetDateTime odt = OffsetDateTime.now(ZoneOffset.of("+05:30"));
```

---

## 6. ZoneId

Represents timezone only.

```java
ZoneId zone = ZoneId.of("Asia/Kolkata");
```

---

## 7. MonthDay

Represents month and day only.

- Year is not included

```java
MonthDay birthday = MonthDay.of(Month.JULY, 15);
```

---

## 8. YearMonth

Represents year and month only.

- Day is not included

```java
YearMonth expiry = YearMonth.of(2026, Month.DECEMBER);
```

---

## 9. Year

Represents year only.

```java
Year currentYear = Year.now();
```

---

## 10. Period

Represents a date-based amount of time.

- Years, months, and days

```java
Period age = Period.between(dob, LocalDate.now());
```

---

## 11. Duration

Represents a time-based amount of time.

- Hours, minutes, seconds, nanoseconds

```java
Duration duration = Duration.ofHours(5);
```

---

## 12. Instant

Represents a point on the UTC timeline.

- Epoch seconds and nanoseconds

```java
Instant instant = Instant.now();
```

---

## Comparison Table

| Class | Date | Time | Zone | Offset |
|------|------|------|------|--------|
| LocalDate | yes | no | no | no |
| LocalTime | no | yes | no | no |
| LocalDateTime | yes | yes | no | no |
| ZonedDateTime | yes | yes | yes | yes |
| OffsetDateTime | yes | yes | no | yes |
| ZoneId | no | no | yes | no |
| MonthDay | partial | no | no | no |
| YearMonth | partial | no | no | no |
| Year | partial | no | no | no |
| Period | date-based | no | no | no |
| Duration | no | time-based | no | no |
| Instant | yes | yes | UTC | yes |