function searchStudents() {
  const input = document.getElementById('searchInput').value;
  const results = document.getElementById('searchResults');

  // Clear previous results
  results.innerHTML = '';

  // Perform search logic here
  // For example, you can filter an array of students based on the input value
  const students = [
    { name: 'fatma aslan', id: 1 },
    { name: 'deniz kılınc', id: 2 },
    { name: 'metin kara', id: 3 },
    // ...
  ];

  const filteredStudents = students.filter(student =>
    student.name.toLowerCase().includes(input.toLowerCase())
  );

  // Display results
  if (filteredStudents.length > 0) {
    results.innerHTML = filteredStudents.map(student => `<p>${student.name}</p>`).join('');
  } else {
    results.innerHTML = '<p>No results found</p>';
  }
}